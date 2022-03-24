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
            <h4>Sign up - Personal</h4>

            <sf:form method="post" class="form-horizontal"
                     id="signupForm"
                     modelAttribute="user">

                <div class="form-group">
                    <label class="control-label col-md-4">First Name</label>
                    <div class="col-md-8">
                        <sf:input type="text" path="firstName"
                                  class="form-control"
                                  placeholder="First Name"
                        />
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-4">Last Name</label>
                    <div class="col-md-8">
                        <sf:input type="text" path="lastName"
                                  class="form-control"
                                  placeholder="Last Name"
                        />
                    </div>
                </div>

                <div>
                    <button type="submit"
                            class="btn btn-primary" name="_eventId_billing">
                        Billing
                        <i class="fa-solid fa-chevron-right"></i>
                    </button>
                </div>

            </sf:form>
        </div>
    </div>

</body>

    <jsp:include page="../../shared/common-js.jsp"></jsp:include>

</html>
