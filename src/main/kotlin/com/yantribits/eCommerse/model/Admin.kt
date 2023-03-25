package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.ZonedDateTime
import java.util.*

data class Admin(
    var id: String = UUID.randomUUID().toString(),
    var userName: String,
    var userEmail: String,
    var userAddress: List<UserAddress> = ArrayList(),
    var password: String,
    var forceResetPassword: Boolean = false,
    var passwordCreatedOrLastUpdated: ZonedDateTime? = null,
    var accessRole: AccessRole = AccessRole(),
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
