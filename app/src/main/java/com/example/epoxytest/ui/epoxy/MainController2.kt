package com.example.epoxytest.ui.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import com.example.epoxytest.model.InfoData

class MainController2: TypedEpoxyController<List<InfoData>>() {

    override fun buildModels(data: List<InfoData>?) {
        data?.forEach {
//            mainStyle2 {
//                id(it.title)
//                infoData(it)
//            }
            MainStyle2Model_()
                .id(it.title)
                .infoData(it)
                .addTo(this)
        }
    }

}