package com.example.fupsuisample.Mock

import com.example.fupsuisample.R
import com.example.fupsuisample.data.DataBottomSheet

object MockBottom {

    fun getItemBottomList(): List<DataBottomSheet> {
        val item: ArrayList<DataBottomSheet> = ArrayList()
        item.add(DataBottomSheet("14 Nisan 2024", R.drawable.ic_kartopu, "İnaktif Müşteri İşletim Ücreti", "-₺0,21", "14:30"))
        item.add(DataBottomSheet("10 Nisan 2024", R.drawable.ic_kartopu, "BIM MARKET A.Ş", "-₺298,50", "16:30"))
        item.add(DataBottomSheet("05 Nisan 2024", R.drawable.ic_kartopu, "TOPLU TAŞIMA BEDELİ", "-₺22,50", "12:54"))
        item.add(DataBottomSheet("13 Mart 2024", R.drawable.ic_kartopu, "AHMET BÜFE", "-₺70,00", "23:56"))
        item.add(DataBottomSheet("12 Mart 2024", R.drawable.ic_kartopu, "ÖZDİLEK HİPERMARKET", "-₺153,70", "21:30"))
        item.add(DataBottomSheet("11 Mart 2024", R.drawable.ic_kartopu, "LC WAİKİKİ HARCAMA", "-₺250,99", "15:30"))
        item.add(DataBottomSheet("25 Şubat 2024", R.drawable.ic_kartopu, "NUSR-ET RESTAURANT", "-₺900,00", "00:30"))
        item.add(DataBottomSheet("20 Şubat 2024", R.drawable.ic_kartopu, "BUSKİ ", "-₺230,40", "14:24"))
        item.add(DataBottomSheet("16 Şubat 2024", R.drawable.ic_kartopu, "YAPI KREDİ BANKASI", "-₺4.99", "14:30"))
        item.add(DataBottomSheet("11 Şubat 2024", R.drawable.ic_kartopu, "ZİRAAT BANKASI", "-₺150,00", "18:30"))
        item.add(DataBottomSheet("08 Şubat 2024", R.drawable.ic_kartopu, "A.Y.T.U GIDA", "-₺345,00", "11:30"))
        item.add(DataBottomSheet("10 Ocak 2024", R.drawable.ic_kartopu, "ULUDAĞ UNİVERSİTESİ", "-₺10,00", "13:27"))
        item.add(DataBottomSheet("02 Ocak 2024", R.drawable.ic_kartopu, "MADO RESTAURANT", "-₺142,90", "10:49"))

        return item
    }
}