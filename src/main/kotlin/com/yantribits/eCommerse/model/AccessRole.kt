package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.ArrayList
import java.util.UUID


@Entity(name = "access_roles")
data class AccessRole(
    @Id
    var id: String = UUID.randomUUID().toString(),
    @Column(unique = true, nullable = false)
    var name: String = "",
    @Column(nullable = false)
    var desc: String = "",
    @OneToMany(targetEntity = AccessControl::class)
    var accessControl: List<AccessControl> = ArrayList(),
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @CreationTimestamp
    var createdDate: CreatedDate = CreatedDate(),
    @UpdateTimestamp
    var modifiedDate: LastModifiedDate = LastModifiedDate()
)
