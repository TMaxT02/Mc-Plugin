/**
 *
 */
package com.demo.hibernate.entity

import java.io.Serializable
import javax.persistence.*
@Entity
@Table(name = "BOOK")
class PlayerEntity : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id = 0
    var title: String? = null
    var author: String? = null
    var price = 0.0
}