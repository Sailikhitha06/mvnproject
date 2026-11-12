// Interactive script for the department website
document.addEventListener("DOMContentLoaded", () => {
    const exploreBtn = document.getElementById("exploreBtn");

    if (exploreBtn) {
        exploreBtn.addEventListener("click", () => {
            const programsSection = document.getElementById("programs");
            if (programsSection) {
                programsSection.scrollIntoView({ behavior: 'smooth' });
            }
        });
    }

    console.log("Department website loaded successfully.");
});