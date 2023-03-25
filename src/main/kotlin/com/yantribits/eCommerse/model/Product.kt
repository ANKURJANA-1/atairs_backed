package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.UUID

data class Product(
    var id: String = UUID.randomUUID().toString(),
    var name: String = "",
    var desc: String = "",
    var SKU: String = "",
    var price: Double = 0.0,
    var category: Category = Category(),
    var inventory: Inventory = Inventory(),
    var discount: Discount = Discount(),
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
