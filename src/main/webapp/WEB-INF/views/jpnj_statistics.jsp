<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>TVPSS Smart Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
        }
        .header {
            background-color: #101820;
            color: white;
            padding: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .header a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
        }
        .header a:hover {
            text-decoration: underline;
        }
        .content {
            margin: 20px;
            text-align: center;
        }
        .content h1 {
            margin-bottom: 20px;
        }
        .chart-container {
            position: relative;
            width: 50%;
            margin: 0 auto;
        }
        .footer {
            text-align: center;
            margin-top: 50px;
            font-size: 14px;
            color: #555;
        }
    </style>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <div class="header">
        <span>TVPSS SMART MANAGEMENT SYSTEM</span>
        <nav>
            <a href="dashboard">Home</a>
            <a href="statistics">Statistics</a>
            <a href="monitorTVPSSResource">Monitor School TVPSS Resources</a>
            <a href="#">Log Out</a>
        </nav>
    </div>

    <div class="content">
        <h1>STATISTICS OF TVPSS VERSION</h1>
        <div class="chart-container">
            <canvas id="versionChart"></canvas>
        </div>
    </div>

    <div class="footer">
        &copy; TVPSS, All Rights Reserved
    </div>

    <script>
        const ctx = document.getElementById('versionChart').getContext('2d');
        const versionChart = new Chart(ctx, {
            type: 'pie',
            data: {
                labels: ['Version 1', 'Version 2', 'Version 3', 'Version 4'],
                datasets: [{
                    data: [2, 2, 3, 2],
                    backgroundColor: ['#8e44ad', '#e74c3c', '#3498db', '#f1c40f'],
                }]
            },
            options: {
                plugins: {
                    legend: {
                        position: 'right',
                    }
                }
            }
        });
    </script>
</body>
</html>