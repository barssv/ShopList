package ru.barssv.android.shoplist.domain

class AddShopItemUseCase (private val shopListRepository: ShopListRepository) {
//добавляет элементы списка и содержит один метод:
//принимает shopItem и ничего не возвращает
    fun addShopItem (shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)


    }
}