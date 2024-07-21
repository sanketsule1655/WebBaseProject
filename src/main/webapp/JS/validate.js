function validateVendor()
{
	var vendName = document.getElementById("txtVend").value;
	let regExp = /^[a-zA-Z]+$/;
	let result = regExp.test(vendName);
	if(result==false)
	{
		let span = document.getElementById("s");
		span.innerHTML="Invalid Vendor Name";
		let button=document.getElementById("btn");
		button.disabled=true;
		return false;
	}
	else
	{
		let span = document.getElementById("s");
		span.innerHTML="";
		let button=document.getElementById("btn");
		button.disabled=false;
		return true;
	}
}
function searchUsingAjax(str)
{
	let xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function()
	{
		if(this.readyState==4 && this.status==200)
		{
			document.getElementById("showGrid").innerHTML=this.responseText;
		}
	};
	xhttp.open("GET","searchVendor?n="+str,true);
	xhttp.send();
} 
function getProductListByVendor()
{
	let vendorId=parseInt(document.getElementById("vid").value);
	let xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function()
	{
		if(this.readyState==4 && this.status==200)
		{
			document.getElementById("grid").innerHTML=this.responseText;
		}
	}
	xhttp.open("GET","getprodbyvendor.jsp?vid="+vendorId,true);
	xhttp.send();
}





