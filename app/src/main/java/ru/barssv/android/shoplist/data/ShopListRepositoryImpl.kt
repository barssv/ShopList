package ru.barssv.android.shoplist.data

import ru.barssv.android.shoplist.domain.ShopItem
import ru.barssv.android.shoplist.domain.ShopListRepository

object ShopListRepositoryImpl: ShopListRepository {

    private val shoplist = mutableListOf<ShopItem>()
    private var autoIncrementID=0


    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.UNDEFINED_ID){
        shopItem.id = autoIncrementID++}
        shoplist.add(shopItem)

    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shoplist.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shoplist.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shoplist.find {
            it.id==shopItemId
        } ?: throw RuntimeException("element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shoplist.toList()
    }

}

