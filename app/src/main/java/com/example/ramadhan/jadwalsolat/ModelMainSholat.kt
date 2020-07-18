package com.example.ramadhan.jadwalsolat

import java.io.Serializable


class ModelMainSholat : Serializable {

    var txtFajr: String? = null
    var txtDhuhr: String? = null
    var txtAsr: String? = null
    var txtMaghrib: String? = null
    var txtIsha: String? = null
    var txtImsak: String? = null

    @JvmField
    var txtDate: String? = null

    @JvmField
    var txtDay: String? = null
    var txtYear: String? = null
    var txtYearMonth: String? = null
    var txtWeekDay: String? = null

}