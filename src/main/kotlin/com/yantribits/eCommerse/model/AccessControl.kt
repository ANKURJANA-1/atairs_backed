package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import com.yantribits.eCommerse.model.enums.MethodType
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.ArrayList
import java.util.UUID


@Entity(name = "access_controls")
data class AccessControl(
    @Id
    var id: String = UUID.randomUUID().toString(),
    @Column(nullable = false, unique = true)
    var name: String = "",
    @Column(nullable = false)
    var desc: String = "",
    @Column(nullable = false, unique = true)
    var title: String = "",
    @Column(nullable = false, unique = true)
    var methodName: String = "",
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var methodType: MethodType = MethodType.NOT_DEFINE,
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @CreationTimestamp
    var createdDate: CreatedDate = CreatedDate(),
    @UpdateTimestamp
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
