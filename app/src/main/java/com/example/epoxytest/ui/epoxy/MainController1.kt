package com.example.epoxytest.ui.epoxy

import android.content.Context
import android.util.Log
import com.airbnb.epoxy.AutoModel
import com.airbnb.epoxy.Typed2EpoxyController
import com.airbnb.epoxy.TypedEpoxyController
import com.example.epoxytest.model.InfoData

private const val TAG = "MainController"
class MainController1: TypedEpoxyController<List<InfoData>>() {

    override fun buildModels(data: List<InfoData>?) {
        data?.forEach {
//            mainStyle1 {
//                id(it.title)
//                infoData(it)
//            }
            MainStyle1Model_()
                .id(it.title)
                .infoData(it)
                .addTo(this)
        }
    }

}