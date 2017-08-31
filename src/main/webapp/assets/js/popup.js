function popup() {
	var modal = document.getElementById('myModal11');
	modal.style.display = "block";
	var span = document.getElementsByClassName("close1")[0];
	span.onclick = function() {
		modal.style.display = "none";
	}
}

function ownerEmailExpirePopup() {
	var modal = document.getElementById('ownerEmailExpire');
	modal.style.display = "block";
	var span = document.getElementsByClassName("close1")[1];
	span.onclick = function() {
		modal.style.display = "none";
	}
}

function emailExpirePopup() {
	var modal = document.getElementById('userEmailExpire');
	modal.style.display = "block";
	var span = document.getElementsByClassName("close1")[1];
	span.onclick = function() {
		modal.style.display = "none";
	}
}