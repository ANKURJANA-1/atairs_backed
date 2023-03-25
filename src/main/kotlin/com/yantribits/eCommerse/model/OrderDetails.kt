package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import com.yantribits.eCommerse.model.enums.OderStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*

data class OrderDetails(
    var id: String = UUID.randomUUID().toString(),
    var userId: String = "",
    var paymentDetailsId: String = "",
    var orderItemsId: String = "",
    var totalAmount: Double = 0.0,
    var orderStatus: OderStatus = OderStatus.ACCEPTED,
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
