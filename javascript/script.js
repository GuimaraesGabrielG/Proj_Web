function resultado(operacao){
    console.log(operacao);
    var num1 = document.getElementById("idnum1").value;
    var num2 = document.getElementById("idnum2").value;

    console.log(num1);
    console.log(num2);

     switch (operacao) {
         case "+":
             console.log("entrou")
             var resultado = parseInt(num1) + parseInt(num2) ;
             document.getElementById("idresultado").innerHTML = resultado;
             break;
          case "-":

                var resultado = parseInt(num1) - parseInt(num2) ;
                document.getElementById("idresultado").innerHTML = resultado;


             break;
            case "/":
             var resultado = parseInt(num1)/parseInt(num2) ;
            document.getElementById("idresultado").innerHTML = resultado;

             break;
          case "x":

                var resultado = parseInt(num1) * parseInt(num2) ;
                document.getElementById("idresultado").innerHTML = resultado;

             break;
     
         default:
                

             break;
     }
 }