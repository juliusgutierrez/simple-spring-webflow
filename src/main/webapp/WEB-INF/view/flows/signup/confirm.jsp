<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<head>
    <jsp:include page="../../shared/common-css.jsp"></jsp:include>
</head>

<body>
<div class="container">

    <div class="mt-5">
        <a href="${flowExecutionUrl}&_eventId_home">HOME</a>
    </div>
    <div class="mt-3">
        <div class="mt-1">
            <h3>Personal Details</h3>

            <div>
                Name: ${registerModel.user.firstName} ${registerModel.user.lastName}
            </div>
        </div>

        <div class="mt-5">
            <h3>Billing Details</h3>

            <div>
                Address: ${registerModel.billing.address}
            </div>

        </div>

        <div class="mt-3">
            <a href="${flowExecutionUrl}&_eventId_billing" class="btn btn-primary">
                <i class="fa-solid fa-chevron-left"></i>
                <span>Billing</span>
            </a>

            <a href="${flowExecutionUrl}&_eventId_submit" class="btn btn-primary">
                <span>Submit</span>
                <i class="fa-solid fa-chevron-right"></i>
            </a>

        </div>

    </div>
</div>

</body>

<jsp:include page="../../shared/common-js.jsp"></jsp:include>

</html>
