package com.example.epoxytest.model

import android.content.Context
import com.example.epoxytest.R

data class InfoData(
    val title: String,
    val drawableId: Int
) {
    companion object {
        val fakeDataList = listOf<InfoData>(
            InfoData("luffy", R.drawable.onepiece01_luffy),
            InfoData("zoro", R.drawable.onepiece02_zoro_bandana),
            InfoData("nami", R.drawable.onepiece03_nami),
            InfoData("usopp", R.drawable.onepiece04_usopp_sogeking),
            InfoData("sanji", R.drawable.onepiece05_sanji),
            InfoData("chopper", R.drawable.onepiece06_chopper),
            InfoData("robin", R.drawable.onepiece07_robin),
            InfoData("franky", R.drawable.onepiece08_franky),
            InfoData("brook", R.drawable.onepiece09_brook),
        )
    }
}