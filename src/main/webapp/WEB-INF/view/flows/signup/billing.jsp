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
        <h4>Sign up - Billing Address</h4>

        <sf:form method="post" class="form-horizontal"
                 id="signupForm"
                 modelAttribute="billing">

            <div class="form-group">
                <label class="control-label col-md-4">Address</label>
                <div class="col-md-8">
                    <sf:input type="text" path="address"
                              class="form-control"
                              placeholder="Address"
                    />
                    <sf:errors path="address" cssClass="text-danger" element="em"/>
                </div>
            </div>

            <div>

                <button type="submit"
                        class="btn btn-primary" name="_eventId_signup">
                    <i class="fa-solid fa-chevron-left"></i>
                    Personal
                </button>

                <button type="submit"
                        class="btn btn-primary" name="_eventId_billing">
                    Confirm
                    <i class="fa-solid fa-chevron-right"></i>
                </button>
            </div>

        </sf:form>
    </div>
</div>

</body>

<jsp:include page="../../shared/common-js.jsp"></jsp:include>

</html>
