function resetForm() {
    document.getElementById("festivalForm").reset();
}

function recommendFestival() {
    const form = document.getElementById('festivalForm');
    const formData = new FormData(form);

    
    console.log("성별: ", formData.get('gender'));
    console.log("연령대: ", formData.get('ageGroup'));
    console.log("희망시기: ", formData.get('preferredTime'));
    console.log("희망여행지: ", formData.get('preferredLocation'));

    const themes = formData.getAll('theme');
    console.log("축제테마: ", themes.join(", "));

    window.location.href = 'age.html'; 
}

document.addEventListener('DOMContentLoaded', function() {
    var festivals = JSON.parse('<%= new Gson().toJson(request.getAttribute("recommendedFestivals")) %>');
 var tables = document.querySelectorAll('#festival-form table');
    var festivalIndex = 0;

    tables.forEach(function(table) {
        var rows = table.querySelectorAll('tr');
        rows.forEach(function(row, rowIndex) {
            var cells = row.querySelectorAll('td');
            cells.forEach(function(cell, cellIndex) {
                if (festivalIndex < festivals.length) {
                    var festival = festivals[festivalIndex];
                    if (rowIndex === 0) {
                       
                        cell.querySelector('img').src = festival.imageUrl;
                        cell.querySelector('img').alt = festival.name;
                    } else if (rowIndex === 1) {
                  
                        cell.textContent = festival.name;
                    } else if (rowIndex === 2) {
                 
                        cell.textContent = festival.date;
                    }
                 
                      festivalIndex++;
                }
            });
        });
    });
});

