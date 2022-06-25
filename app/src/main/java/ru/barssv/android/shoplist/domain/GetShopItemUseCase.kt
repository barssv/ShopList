package ru.barssv.android.shoplist.domain


// получает элемент по его Id

class GetShopItemUseCase (private val shopListRepository: ShopListRepository){

    fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)


        // принимает shopItemId и возвращает ShopItem
    }


}