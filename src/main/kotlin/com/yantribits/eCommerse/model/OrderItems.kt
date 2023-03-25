package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*

data class OrderItems(
    var id: String = UUID.randomUUID().toString(),
    var quantity: Int = 0,
    var totalAmount: Double = 0.0,
    var cartSessions: List<ShoppingSession> = ArrayList(),
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
