package ru.barssv.android.shoplist.domain


// редактирует элемент из списка и имеет один метод

class EditShopItemUseCase (private val shopListRepository: ShopListRepository){

    fun editShopItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)

        //получает shopItem и ничего не возвращает
    }
}