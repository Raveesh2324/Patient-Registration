package org.hmispb.patientregistration.model

data class LabTestName(
    val labCode: Int,
    val labName: String,
    val testCode: Int,
    val testName: String
)