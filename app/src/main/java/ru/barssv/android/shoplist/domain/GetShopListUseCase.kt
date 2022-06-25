package ru.barssv.android.shoplist.domain


// получает весь список элементов


class GetShopListUseCase (private val shopListRepository: ShopListRepository){

    fun getShopList():List <ShopItem>{
        return shopListRepository.getShopList()

        //не принимает параметров и возвращает List наших элементов
    }
}