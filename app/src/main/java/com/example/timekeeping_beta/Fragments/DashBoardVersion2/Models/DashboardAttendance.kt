package com.example.timekeeping_beta.Fragments.DashBoardVersion2.Models

data class DashboardAttendance(
        var total_absent: Int,
        var working_days: Int,
        var present: Int,
        var percentage: Double
)