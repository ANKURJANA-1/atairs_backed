package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.ArrayList
import java.util.UUID

data class User(
    var id: String = UUID.randomUUID().toString(),
    var userName: String = "",
    var userEmail: String = "",
    var userAddress: List<UserAddress> = ArrayList(),
    var password: String = "",
    var accessRole: AccessRole = AccessRole(),
    var userPaymentAddress: List<PaymentAddress> = ArrayList(),
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
