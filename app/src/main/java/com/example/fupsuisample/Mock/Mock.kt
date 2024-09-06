package com.example.fupsuisample.Mock

import com.example.fupsuisample.R
import com.example.fupsuisample.data.DataList

object Mock {

    fun getItemList(): List<DataList> {
        val item:ArrayList<DataList> = ArrayList()
        item.add(DataList(R.drawable.wallet_icon,"Yeni Hesap","Yeni bir hesap oluşturabilirsin."))
        item.add(DataList(R.drawable.new_card,"Yeni Kart","Kartını bağlayabilir, yeni kart isteyebilir,sanal kart \noluşturabilirsin."))
        item.add(DataList(R.drawable.qr_code,"QR İşlemleri","QR ile ATM'den para çekebilir, POS cihazında ödeneme\noluşturabilirsin."))
        item.add(DataList(R.drawable.hourglass_icon,"Bekleyen İşlemlerim","Bekleyen işlemlerini yönetebilirsin."))
        item.add(DataList(R.drawable.reverse_arrow,"Para Transferi","Para gönderebilir, isteyebilir veya düzenli para\ntransferleri oluşturabilirsin."))
        item.add(DataList(R.drawable.bill_icon,"Fatura Ödeme","Faturanı ödeyebilir, düzenli ödeme talimatı\nverebilirsin."))
        item.add(DataList(R.drawable.recorded_icon,"Abonelikler","Kayıtlı aboneliklerini düzenleyebilir veya yeni\nabnonelik tanımlayabilirsin."))
        item.add(DataList(R.drawable.stop_icon,"Engellenen İş Yerleri","Engellenen iş yerlerini yönetebilirsin."))
        item.add(DataList(R.drawable.people_sharp_icon,"Böl Böl","Böl Böl ödemelerini yönetebilirsin."))
        item.add(DataList(R.drawable.controller_game_icon,"Oyun & E-PIN","En güncel oyun kodlarını alabilirsin."))

        return item
    }
}