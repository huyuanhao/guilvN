package com.qiyukf.nimlib.p177c;

import com.qiyukf.nimlib.p177c.p178a.C2195c;

/* renamed from: com.qiyukf.nimlib.c.b */
public final class C2199b extends C2195c {

    /* renamed from: a */
    public static final C2199b f4386a = new C2199b();

    public C2199b() {
        super(new C2195c.C2196a[]{new C2195c.C2196a("msghistory").mo34784a(new C2195c.AbstractC2197b() {
            /* class com.qiyukf.nimlib.p177c.C2199b.C22012 */

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: a */
            public final String[] mo34788a() {
                return new String[]{"CREATE TABLE IF NOT EXISTS msghistory(messageid Integer PRIMARY KEY AUTOINCREMENT, uuid Varchar(32) NOT NULL, serverid Long, id Varchar(32) NOT NULL, fromid Varchar(32) NOT NULL, sessiontype Integer, time Long, status Integer, direct Integer, msgtype Integer, content Varchar(512), status2 Integer, attach TEXT)", "CREATE INDEX IF NOT EXISTS msghistory_uuid_index on msghistory(uuid)", "CREATE INDEX IF NOT EXISTS msghistory_id_sessiontype_time on msghistory(id, sessiontype, time)"};
            }

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: b */
            public final String[] mo34789b() {
                return null;
            }
        }).mo34784a(new C2195c.AbstractC2197b() {
            /* class com.qiyukf.nimlib.p177c.C2199b.C22001 */

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: a */
            public final String[] mo34788a() {
                return new String[]{"CREATE TABLE IF NOT EXISTS msghistory(messageid Integer PRIMARY KEY AUTOINCREMENT, uuid Varchar(32) NOT NULL, serverid Long, sessionid, Long, id Varchar(32) NOT NULL, fromid Varchar(32) NOT NULL, sessiontype Integer, sessiontime Long, visitorid Long, foreignid Varchar(128), time Long, sort Long, status Integer, direct Integer, msgtype Integer, content Varchar(512), status2 Integer, attach TEXT,ext TEXT )", "CREATE INDEX IF NOT EXISTS msghistory_uuid_index on msghistory(uuid)", "CREATE INDEX IF NOT EXISTS msghistory_visitor_time on msghistory(foreignid, visitorid, sort)"};
            }

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: b */
            public final String[] mo34789b() {
                return new String[]{"ALTER TABLE msghistory ADD ext TEXT"};
            }
        }), new C2195c.C2196a("lastMsg").mo34784a(new C2195c.AbstractC2197b() {
            /* class com.qiyukf.nimlib.p177c.C2199b.C22034 */

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: a */
            public final String[] mo34788a() {
                return new String[]{"CREATE TABLE IF NOT EXISTS lstmsg(uid Varchar(16) NOT NULL, messageId long, msgstatus INTEGER, sessiontype INTEGER, unreadnum integer, content Varchar(512), time long, tag INTEGER default 0, tag_time long default 0, fromuid Varchar(16))", "CREATE UNIQUE INDEX IF NOT EXISTS lstmsg_uid_sessiontype on lstmsg(uid, sessiontype)"};
            }

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: b */
            public final String[] mo34789b() {
                return null;
            }
        }).mo34784a(new C2195c.AbstractC2197b() {
            /* class com.qiyukf.nimlib.p177c.C2199b.C22023 */

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: a */
            public final String[] mo34788a() {
                return new String[]{"CREATE TABLE IF NOT EXISTS lstmsg(uid Varchar(16) NOT NULL, messageId long, msgstatus INTEGER, sessiontype INTEGER, unreadnum INTEGER, content Varchar(512), time long, tag INTEGER default 0, tag_time long default 0, fromuid Varchar(16), msgtype INTEGER, attach TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS lstmsg_uid_sessiontype on lstmsg(uid, sessiontype)"};
            }

            @Override // com.qiyukf.nimlib.p177c.p178a.C2195c.AbstractC2197b
            /* renamed from: b */
            public final String[] mo34789b() {
                return new String[]{"ALTER TABLE lstmsg ADD msgtype INTEGER", "ALTER TABLE lstmsg ADD attach TEXT"};
            }
        })});
    }
}
