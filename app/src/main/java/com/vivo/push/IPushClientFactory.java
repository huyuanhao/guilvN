package com.vivo.push;

import android.content.Intent;
import com.vivo.push.p282c.AbstractC4064ab;

public interface IPushClientFactory {
    AbstractC4064ab createReceiveTask(AbstractC4160y yVar);

    AbstractC4160y createReceiverCommand(Intent intent);

    AbstractRunnableC4157v createTask(AbstractC4160y yVar);
}
