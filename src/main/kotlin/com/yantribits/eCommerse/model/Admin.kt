package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.ZonedDateTime
import java.util.*


@Entity(name = "user_admins")
data class Admin(
    @Id
    var id: String = UUID.randomUUID().toString(),
    @Column(nullable = false)
    var userName: String,
    @Column(nullable = false, unique = true)
    var userEmail: String,
    var userAddress: List<UserAddress> = ArrayList(),
    @Column(nullable = false)
    var password: String,
    @Column(nullable = false)
    var forceResetPassword: Boolean = false,
    @Column(nullable = false)
    var passwordCreatedOrLastUpdated: ZonedDateTime? = null,
    @OneToOne(targetEntity = AccessRole::class)
    var accessRole: AccessRole = AccessRole(),
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @CreationTimestamp
    var createdDate: CreatedDate = CreatedDate(),
    @UpdateTimestamp
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
