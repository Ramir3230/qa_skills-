const b1 = document.querySelector('#b1')
const b2 = document.querySelector('#b2')
const s1 = document.querySelector('#s1')
const s2 = document.querySelector('#s2')
const br = document.querySelector('#br')
const score = document.querySelector('#score')
const historyList = document.querySelector('#history')
let i = 0;
let j = 0;
let winScore = 3;
let gameOver = false;
let history = [];


function color1 (){
    s1.style.color = "darkgreen"
    s1.style.transition = "all 0.5s"
    s2.style.transition = "all 0.5s"
    s2.style.color = "brown" 
    s1.textContent = winScore 
    b1.style.backgroundColor = 'rgba(0, 194, 126, 0.73)'
    b2.style.backgroundColor = 'rgba(101, 0, 160, 0.70)'
    b1.style.transition = "all 0.5s"
    b2.style.transition = "all 0.5s"
    history.push("Player 1 WIN!");
}
// 101, 0, 160, 0.797
function color2 (){
    s2.style.color = "darkgreen"
    b2.style.backgroundColor = 'rgba(101, 0, 160, 0.70)'
    b1.style.backgroundColor = 'rgba(0, 194, 126, 0.73)'
    s2.style.transition = "all 0.5s"
    s1.style.transition = "all 0.5s"
    s1.style.color = "brown" 
    s2.textContent = winScore
    b1.style.transition = "all 0.5s"
    b2.style.transition = "all 0.5s"
    history.push("Player 2 WIN!");
}

function updateHistory() {
    if (history.length > 10) {
        history.shift(); 
    }

    
    historyList.innerHTML = ''; 
    history.forEach(function(item) {
        let listItem = document.createElement('li');
        listItem.textContent = item;
        historyList.appendChild(listItem); 
    });
}

// function colorB (){
     
    
//     b1.style.transition = "all 0.3s"
//     b2.style.transition = "all 0.3s"
// }


document.addEventListener('keydown', function(event) {
    if (event.key === 'Shift' && event.location === 1) {
        if (!gameOver) {
            i += 1;
            if (i === winScore) {
                gameOver = true;
                color1();
                updateHistory();
            }
            s1.textContent = i;
        }
    }
});
b1.addEventListener('click', function(){
    
    if(!gameOver){
        i += 1;
        if(i === winScore){
            gameOver = true;

            return color1(); 
            updateHistory();
            
        }
        s1.textContent = i;
    }
});

document.addEventListener('keydown', function(event) {
    if (event.key === 'Shift' && event.location === 2) {
        if (!gameOver) {
            j += 1;
            if (j === winScore) {
                gameOver = true;
                color2();
                updateHistory();
            }
            s2.textContent = j;
        }
    }
});
b2.addEventListener('click', function(){
    
    if(!gameOver){
        j += 1;
            if(j === winScore){
                gameOver = true;

                return color2(); 
                updateHistory();    
            }
        s2.textContent = j;
    }
});

document.addEventListener('keydown', function(event) {
    if (event.key === 'Enter') {
        reset();
        updateHistory();
    }
});

br.addEventListener('click', function(){
    reset();
    updateHistory();
}); 

function reset (){
   gameOver = false;
   i = 0;
   j = 0;
   s1.textContent = 0;
   s2.textContent = 0;
   s1.style.color = 'black'
   s2.style.color = 'black' 
   b2.style.backgroundColor = 'rgba(101, 0, 160)'
   b1.style.backgroundColor = 'rgb(0, 194, 126)'
   updateHistory();
}

function resetHistory(){

}

score.addEventListener('change', function(){
    winScore = parseInt(this.value);
    reset()
    updateHistory();
})








// b2.addEventListener('click', function(){
    
//     s2.innerText = `${j++}`;
// });

//  s1.style.color = "green"
//             s1.style.fontSize = "35px";
//             s1.style.transition = "all 1s"
//             s2.style.color = "red" 

//  // if(j === winScore){
//                 s2.style.color = "green"
//                 s2.style.fontSize = "35px";
//                 s2.style.transition = "all 1s"
//                 s1.style.color = "red"
            // }





// const p1Button = document.querySelector('#p1Button')
// const p2Button = document.querySelector('#p2Button')
// const p2Display = document.querySelector('#p2Display')
// const p1Display = document.querySelector('#p1Display')


// let p1Score = 0;
// let p2Score = 0;
// let winningScore = 5;
// let isGameOver = false;

// p1Button.addEventListener('click', function(){
//     if(!isGameOver){
//         p1Score += 1;
//         if(p1Score === winningScore){
//           isGameOver = true;  
            
//         }
//         p1Display.textContent = p1Score;
//     }
// })

// p2Button.addEventListener('click', function(){
//     if(!isGameOver){
//         p2Score += 1;
//         if(p2Score === winningScore){
//           isGameOver = true;  
            
//         }
//         p2Display.textContent = p2Score;
//     }
// })