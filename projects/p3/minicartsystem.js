<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
            background: linear-gradient(135deg, #667eea, #764ba2);
            min-height: 100vh;
            margin: 0;
        }
        .cart-box{
            max-width: 400px;
            margin: 50px auto;
            padding: 30px;
            background: white;
            border-radius: 16px;
            box-shadow: 0 8px 32px rgba(0,0,0,0.2);
            font-family: Arial;
        }
        #iteminput {
            width: 100%;
            padding: 10px;
            border: 2px solid #667eea;
            border-radius: 8px;
            font-size: 16px;
            margin-bottom: 10px;
            outline: none;
        }
        .btn {
            border: 1px solid #ccc;
            font-family: Arial;
            border-radius: 8px;
            font-size: 20px;
        }
        #addbtn {
            background: #43e97b;
            color: white;
            border: none;
            padding: 10px 16px;
            border-radius: 8px;
            cursor: pointer;
            font-size: 15px;
        }
        #removebtn {
            background: #f5576c;
            color: white;
            border: none;
            padding: 10px 16px;
            border-radius: 8px;
            cursor: pointer;
            font-size: 15px;
        }
        #caltotal {
            background: #667eea;
            color: white;
            border: none;
            padding: 10px 16px;
            border-radius: 8px;
            cursor: pointer;
            font-size: 15px;
            margin-top: 10px;
            width: 100%;
        }
        p {
            font-size: 16px;
            color: #333;
            margin: 8px 0;
        }

    </style>
</head>

<body>
    <div class="cart-box">
        <div>
            <input id="iteminput", type="number", placeholder="Enter Price">
            <button id="addbtn">Add Item</button>
            <button id="removebtn">Remove Item</button>
            <p id="itemcount"></p>
            <button id="caltotal", class="btn">Calculate Total</button>
            <p id="totalp">Total price:</p>
            <p id="isdiscountapplied">Discount:</p>
            <p id="shipmessage">Shipping message:</p>
        </div>
    </div>

    <script>
        let cart = [1400, 1500, 4500, 2300];


        let butn = document.getElementById("caltotal");
        butn.addEventListener("click", function(){
            calculateCart();
        }
        );
        
        let inputitem = document.getElementById("iteminput");
      //  let value = Number(inputitem.value);  converts text to number

        let addbtn = document.getElementById("addbtn");
        addbtn.addEventListener("click", function(){
            let value = Number(inputitem.value);

            if (inputitem.value === "" || value<=0){
                alert("enter valid price");
                return;
            }

            cart.push(value);
            inputitem.value = "";
            inputitem.focus();
            calculateCart();
        } );

        let removebtn = document.getElementById("removebtn");
        removebtn.addEventListener("click", function(){

            let value = Number(inputitem.value);

            if (inputitem.value === "" || value <= 0) {
                alert("Enter valid price to remove");
                return;
            }
            let index = cart.indexOf(value);

            if (index === -1) {
                alert("Item not found in cart");
                return;
            }

            cart.splice(index, 1);

            inputitem.value = "";
            calculateCart();
        });
        let printtot = document.getElementById("totalp");
        let disco= document.getElementById("isdiscountapplied");
        let shipms= document.getElementById("shipmessage");

        function calculateCart(){
            if (cart.length === 0) {
                shipms.textContent = "Shipping: -";
                disco.textContent = "Discount: -";
                printtot.textContent = "Total price: 0";
                return;
            }

                    let total = 0;
                    for (let i=0; i<cart.length; i++ ){
                        total = total + cart[i];
                    }
                    

                    let dmessage;
                    let fdisco = 0;
                    if (total>5000){
                        fdisco = 0.20;
                        dmessage = "you availed 20% discount";
                    } else {
                        dmessage = "no discount";
                    }

                    let afdis = total * fdisco;
                    let famount = total - afdis;

                    printtot.textContent = "Total price: " + famount;


                    disco.textContent = "Discount: " + dmessage;

                    let shipmessage;
                    if (famount>3000){
                        shipmessage = "Free Shipping";
                    } else {
                        shipmessage = "Shipping charges = 250";
                    }
                    shipms.textContent = "Shipping: " + shipmessage;

                    document.getElementById("itemcount").textContent = "Items in cart: " + cart.length;

            
        };
        calculateCart();

    </script>
</body>
</html>
