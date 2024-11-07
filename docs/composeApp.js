
function viewDate(){
    let mydate = new Date();
    const dayofweek = ["ΚΥΡΙΑΚΗ", "ΔΕΥΤΕΡΑ" ,"ΤΡΙΤΗ" ,"ΤΕΤΑΡΤΗ" ,"ΠΕΜΠΤΗ" ,"ΠΑΡΑΣΚΕΥΗ" ,"ΣΑΒΒΑΤΟ"];
    let d_w = mydate.getDay();
    let day =dayofweek[d_w];
    document.getElementById("day_week").innerHTML = day.toLocaleString();
    const months =["ΙΑΝΟΥΑΡΙΟΥ", "ΦΕΒΡΟΥΑΡΙΟΥ","ΜΑΡΤΙΟΥ", "ΑΠΡΙΛΙΟΥ","ΜΑΙΟΥ","ΙΟΥΝΙΟΥ","ΙΟΥΛΙΟΥ","ΑΥΓΟΥΣΤΟΥ","ΣΕΠΤΕΜΒΡΙΟΥ","ΟΚΤΩΒΡΙΟΥ","ΝΟΕΜΒΡΙΟΥ","ΔΕΚΕΜΒΡΙΟΥ"];
    document.getElementById("day").innerHTML = mydate.getDate();
    document.getElementById("month").innerHTML =  months[mydate.getMonth()];
    document.getElementById("year").innerHTML =  mydate.getFullYear();
    //document.getElementById("my_time").innerHTML = mydate.getTime();
  };

  function toMysite(){
    document.getElementById('logo1').onclick = function() {
             window.location.href = "https://of-the-mathematics-btj-a5d29.firebaseapp.com/";
    };
 //    mylogo.onclick() = location().href("https://of-the-mathematics-btj-a5d29.firebaseapp.com/")
   };
