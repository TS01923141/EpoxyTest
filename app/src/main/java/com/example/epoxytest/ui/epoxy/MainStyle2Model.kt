package com.example.epoxytest.ui.epoxy

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.bumptech.glide.Glide
import com.example.epoxytest.R
import com.example.epoxytest.model.InfoData

private const val TAG = "MainStyle2Model"
@EpoxyModelClass(layout = R.layout.item_main_style2)
abstract class MainStyle2Model: EpoxyModelWithHolder<MainStyle2Model.Holder>() {
    @EpoxyAttribute lateinit var infoData: InfoData

    override fun bind(holder: Holder) {
        super.bind(holder)
        Glide.with(holder.imageView_style2.context)
            .load(infoData.drawableId)
            .into(holder.imageView_style2)
        holder.textView_style2.text = infoData.title
    }

    class Holder : EpoxyHolder() {
        lateinit var imageView_style2: ImageView
        lateinit var textView_style2: TextView
        override fun bindView(itemView: View) {
            imageView_style2 = itemView.findViewById(R.id.imageView_style2)
            textView_style2 = itemView.findViewById(R.id.textView_style2)
        }
    }
}