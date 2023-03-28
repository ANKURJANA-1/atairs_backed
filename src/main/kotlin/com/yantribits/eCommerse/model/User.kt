package com.yantribits.eCommerse.model

import com.yantribits.eCommerse.model.enums.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.ArrayList
import java.util.UUID

data class User(
    var id: String = UUID.randomUUID().toString(),
    var userName: String = "",
    var userEmail: String = "",
    var userAddress: List<UserAddress> = ArrayList(),
    var password: String = "",
    var accessRole: AccessRole = AccessRole(),
    var userPaymentAddress: List<PaymentAddress> = ArrayList(),
    var dataStatus: DataStatus? = DataStatus.ACTIVE,
    var createdDate: CreatedDate = CreatedDate(),
    var modifiedDate: LastModifiedDate = LastModifiedDate()
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