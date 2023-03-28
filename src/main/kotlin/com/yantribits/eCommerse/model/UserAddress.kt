package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.ZonedDateTime
import java.util.*


@Entity(name = "user_address")
data class UserAddress(
    @Id
    var id: String = UUID.randomUUID().toString(),
    @Column(nullable = false)
    var address1: String = "",
    @Column(nullable = false)
    var address2: String = "",
    @Column(nullable = false)
    var state: String = "",
    @Column(nullable = false)
    var contactNo: String = "",
    @Column(nullable = false)
    var country: String = "",
    @Column(nullable = false)
    var countryCode: String = "",
    @Column(nullable = false)
    var postalCode: String = "",
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @CreationTimestamp
    var createdDate: ZonedDateTime = ZonedDateTime.now(),
    @UpdateTimestamp
    var modifiedDate: ZonedDateTime = ZonedDateTime.now()
)
