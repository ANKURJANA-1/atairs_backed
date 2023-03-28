package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.ZonedDateTime
import java.util.ArrayList
import java.util.UUID

@Entity(name = "users")
data class User(
    @Id
    var id: String = UUID.randomUUID().toString(),
    @Column(nullable = false)
    var userName: String = "",
    @Column(nullable = false, unique = true)
    var userEmail: String = "",
    @OneToMany(targetEntity = UserAddress::class)
    var userAddress: List<UserAddress> = ArrayList(),
    @Column(nullable = false)
    var password: String = "",
    @OneToOne(targetEntity = AccessRole::class)
    var accessRole: AccessRole = AccessRole(),
    @OneToMany(targetEntity = PaymentAddress::class)
    var userPaymentAddress: List<PaymentAddress> = ArrayList(),
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @CreationTimestamp
    var createdDate: ZonedDateTime = ZonedDateTime.now(),
    @UpdateTimestamp
    var modifiedDate: ZonedDateTime = ZonedDateTime.now()
)


/*
select * from user where last_modified = 26jan2021 & created = 01jan2011 && deleted = today

select * from history.last_modified,history.user_id

id  |fruit       | sweetness | water | color|    created     | modified     | status
 1   apple           0.2         0.2     red      01.01.2000  01.01.2000     Active
 2  watermelon      0.7         0.9     red      01.01.2000  01.01.2000     Active
 3   banana          0.8         0.4     green   01.01.2000  010.01.2000     Active

user_id    | table_name  |  event _name  | comment| last_modified |  created | status


id  comment         created     | modified     | status
1   user deleted
2   account suspended
3   gov order


fruit comment      created     | modified     | status
2       3

created: entity created / row created
modified: entity modified
status: row status

bana 10 yeelow -> green
banana 10 green -> yellow
 */