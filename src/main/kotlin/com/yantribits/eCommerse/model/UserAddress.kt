package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*

data class UserAddress(
    var id: String = UUID.randomUUID().toString(),
    var address1: String = "",
    var address2: String = "",
    var state: String = "",
    var contactNo: String = "",
    var country: String = "",
    var countryCode: String = "",
    var postalCode: String = "",
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
