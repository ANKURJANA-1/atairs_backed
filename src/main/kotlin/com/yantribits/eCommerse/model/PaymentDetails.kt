package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import com.yantribits.eCommerse.model.enums.PaymentModes
import com.yantribits.eCommerse.model.enums.PaymentStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*

data class PaymentDetails(
    var id: String = UUID.randomUUID().toString(),
    var orderDetailsId: String = "",
    var paymentProviderId: String = "",
    var paymentModes: PaymentModes = PaymentModes.CASH_ON_DELIVERY,
    var paymentStatus: PaymentStatus = PaymentStatus.WAITING_FOR_THE_CONFIRMATION,
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
