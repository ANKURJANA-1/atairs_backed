package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.ArrayList
import java.util.UUID

data class AccessRole(
    var id: String = UUID.randomUUID().toString(),
    var name: String = "",
    var desc: String = "",
    var accessControl: List<AccessControl> = ArrayList(),
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
