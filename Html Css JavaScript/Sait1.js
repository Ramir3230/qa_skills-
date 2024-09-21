// const firstA = document.querySelector('a')
// firstA.innerText = "HOMIE"

function isElementInViewport(el) {
    var rect = el.getBoundingClientRect();
    return (
        rect.top >= 0 &&
        rect.left >= 0 &&
        rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
        rect.right <= (window.innerWidth || document.documentElement.clientWidth)
    );
}


function checkVisibility() {
    var pElement = document.querySelector('.hiddenDot');
    if (isElementInViewport(pElement)) {
        pElement.classList.add('visible');
        window.removeEventListener('scroll', checkVisibility);
    }
}

window.addEventListener('DOMContentLoaded', checkVisibility);
window.addEventListener('scroll', checkVisibility);

document.addEventListener('DOMContentLoaded', function() {
    document.querySelector('.button[for="1"]').addEventListener('click', function(e) {
        e.preventDefault();
        document.querySelector('.hiddenDot').scrollIntoView({ behavior: 'smooth' });
    });
});

function scrollToTop() {
    
    window.scrollTo({
        top: 0,
        behavior: "smooth"
    });
}


window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("scrollTopButton").style.display = "block";
    } else {
        document.getElementById("scrollTopButton").style.display = "none";
    }
}

// const button = document.querySelector('a')
// const h1 = document.querySelector('h1')
// button.addEventListener('click',  function () {
//     const r = Math.floor(Math.random() * 255);
//     const g = Math.floor(Math.random() * 255);
//     const b = Math.floor(Math.random() * 255);
//     const newColor = `rgb(${r}, ${g}, ${b})` ;
//     document.body.style.backgroundColor = newColor;
//     h1.innerText = newColor;
// })
