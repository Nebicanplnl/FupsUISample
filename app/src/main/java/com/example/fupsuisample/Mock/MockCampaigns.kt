package com.example.fupsuisample.Mock

import com.example.fupsuisample.R
import com.example.fupsuisample.data.DataCampaign

object MockCampaigns {

    fun getItemCampaignsList(): List<DataCampaign> {
        val item:ArrayList<DataCampaign> = ArrayList()
        item.add(DataCampaign(R.drawable.netflix, R.drawable.netflix_logo_icon,"Netflix Abonelik Ödemelerinde Anında Nakit\nİade!", "Netflix abonelik ödemeni FUPS Kart ile yap,\nüyeliködemene 19 TL anında nakit iade\nolsun. Kampanya 31 Ağustos 2024 tarihine\nkadar geçerli, her ay 19TL kazanabilirsin."))
        item.add(DataCampaign(R.drawable.campaign_kart_iade, R.drawable.new_card,"İsmine Özel FUPS Kart ücreti, ilk işleminde\nhesabına iade!", "Mobil uygulama veya internet şube\nüzerinden adresine ismine özel FUPS kart\nsipariş et, kart ücreti ilk işleminde hesabına\niade edilsin!"))

        return item
    }
}