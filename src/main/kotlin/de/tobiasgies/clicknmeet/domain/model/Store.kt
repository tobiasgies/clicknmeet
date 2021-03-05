package de.tobiasgies.clicknmeet.domain.model

data class Store(
    val name: String,
    val allowedSimultaneousCustomers: Int,
    val tenant: Tenant
)
