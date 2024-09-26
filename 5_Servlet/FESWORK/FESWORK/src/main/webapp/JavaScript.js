document.addEventListener('DOMContentLoaded', function () {
    const genderFilters = document.querySelectorAll('.gender-filter span');

    genderFilters.forEach(filter => {
        filter.addEventListener('click', function () {
            genderFilters.forEach(item => item.classList.remove('active'));
            this.classList.add('active');

            // Implement filtering logic here if needed
        });
    });
});
