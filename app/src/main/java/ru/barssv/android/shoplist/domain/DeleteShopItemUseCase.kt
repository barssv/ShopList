package ru.barssv.android.shoplist.domain

//удаляет элемент из списка и имеет один метод

class DeleteShopItemUseCase (private val shopListRepository: ShopListRepository) {

    fun deleteShopItem (shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)

        //принимает shopItem и ничего не возвращает
    }
}