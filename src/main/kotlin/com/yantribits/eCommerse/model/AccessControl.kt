package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import com.yantribits.eCommerse.model.enums.MethodType
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.ArrayList
import java.util.UUID

data class AccessControl(
    var id: String = UUID.randomUUID().toString(),
    var name: String = "",
    var desc: String = "",
    var title: String = "",
    var methodName: String = "",
    var methodType: MethodType = MethodType.NOT_DEFINE,
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
