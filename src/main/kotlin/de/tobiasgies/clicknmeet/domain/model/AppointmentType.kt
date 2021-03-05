package de.tobiasgies.clicknmeet.domain.model

import java.time.Duration

data class AppointmentType(
    val name: String,
    val description: String,
    val duration: Duration,
    val tenant: Tenant
)
