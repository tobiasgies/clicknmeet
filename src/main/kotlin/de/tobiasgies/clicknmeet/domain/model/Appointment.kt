package de.tobiasgies.clicknmeet.domain.model

import java.time.ZonedDateTime

data class Appointment(
    val customer: Customer,
    val store: Store,
    val startDate: ZonedDateTime,
    val endDate: ZonedDateTime
)
