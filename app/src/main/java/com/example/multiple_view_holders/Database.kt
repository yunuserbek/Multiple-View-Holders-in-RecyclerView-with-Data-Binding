package com.example.multiple_view_holders

object Database {
    const val TYPE_HEADER = 0
    const val TYPE_ITEM =1
    fun getItems() :ArrayList<Any>{
        val itemlist = arrayListOf<Any>()
        itemlist.add(DataItem.Header("12:00"))
        itemlist.add(DataItem.Item(1,"market"))
        itemlist.add(DataItem.Item(2,"toplantı"))
        itemlist.add(DataItem.Item(1,"iş"))
        itemlist.add(DataItem.Item(1,"telefon parası"))
        itemlist.add(DataItem.Item(1,"görev"))
        itemlist.add(DataItem.Header("15:00"))
        itemlist.add(DataItem.Item(1,"yemek"))
        itemlist.add(DataItem.Item(1,"meyve"))
        itemlist.add(DataItem.Item(1,"tatlı"))
        itemlist.add(DataItem.Item(1,"içeçek"))
        itemlist.add(DataItem.Item(1,"herşey"))
        return itemlist

    }
}