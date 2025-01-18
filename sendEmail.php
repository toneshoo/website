<?php
// Email address verification

//'novelty.saa@gmail.com';
$subject = $_POST['subject'];
$message = $_POST['message'];
$email = $_POST['email'];
$name = $_POST['name'];
$to = 'zinabadn@gmail.com';

use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\SMTP;
use PHPMailer\PHPMailer\Exception;

require "vendor/autoload.php";

$mail = new PHPMailer();

try {
    $mail->isSMTP();
    $mail->SMTPAuth = true;
    $mail->SMTPDebug = SMTP::DEBUG_SERVER;

    $mail->Host = "smtp.gmail.com";
    $mail->SMTPSecure = PHPMailer::ENCRYPTION_STARTTLS;
    

    $mail->Port = 465;
    $mail->Username = "zinabadn@gmail.com";
    $mail->Password = "zmrgfhykbakxgroz";
    $mail->SMTPSecure = 'tls';
    $mail->Port = 587;
    $mail->setFrom($email, $name);
    $mail->addAddress("zinabadn@gmail.com", "Zinab");


    $mail->Subject = $subject;
    $mail->Body = $message;

    $mail->send();
    echo '--------------------------------Message has been sent--------------------------------';

} catch (Exception $e) {
    echo "Message could not be sent. Mailer Error: {$mail->ErrorInfo}";
}

 header("Location: index.html");