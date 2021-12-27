package com.example.epoxytest.ui.epoxy

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.*
import com.bumptech.glide.Glide
import com.example.epoxytest.R
import com.example.epoxytest.model.InfoData
import com.example.epoxytest.ui.epoxy.MainStyle1Model.Holder

private const val TAG = "MainStyle1Model"
@EpoxyModelClass(layout = R.layout.item_main_style1)
abstract class MainStyle1Model : EpoxyModelWithHolder<Holder>() {
    @EpoxyAttribute lateinit var infoData: InfoData

    override fun bind(holder: Holder) {
        super.bind(holder)
        Glide.with(holder.imageView_style1.context)
            .load(infoData.drawableId)
            .into(holder.imageView_style1)
        holder.textView_style1.text = infoData.title
    }

    class Holder : EpoxyHolder() {
        lateinit var imageView_style1: ImageView
        lateinit var textView_style1: TextView
        override fun bindView(itemView: View) {
            imageView_style1 = itemView.findViewById(R.id.imageView_style1)
            textView_style1 = itemView.findViewById(R.id.textView_style1)
        }
    }
}