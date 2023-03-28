package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.ZonedDateTime
import java.util.UUID

@Entity(name = "payment_address")
data class PaymentAddress(
    @Id
    var id: String = UUID.randomUUID().toString(),
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @CreationTimestamp
    var createdDate: ZonedDateTime = ZonedDateTime.now(),
    @UpdateTimestamp
    var modifiedDate: ZonedDateTime = ZonedDateTime.now()
)
