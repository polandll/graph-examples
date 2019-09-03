schema.propertyKey('payload').type(java.util.LinkedHashMap).single().create()
schema.propertyKey('action').type(java.lang.String).single().create()
schema.propertyKey('created_at').type(java.lang.String).single().create()
schema.propertyKey('id').type(java.lang.String).single().create()
schema.propertyKey('login').type(java.lang.String).single().create()
schema.propertyKey('gravatar_id').type(java.lang.String).single().create()
schema.propertyKey('url').type(java.lang.String).single().create()
schema.vertexLabel('ForkEvent').properties('id', 'created_at').create()
schema.vertexLabel('User').properties('gravatar_id', 'url', 'id', 'avatar_url', 'login').create()
schema.vertexLabel('ReleaseEvent').properties('id', 'created_at').create()
schema.vertexLabel('CreateEvent').properties('created_at', 'id').create()
schema.vertexLabel('CommitCommentEvent').properties('created_at', 'id').create()
schema.vertexLabel('PullRequestEvent').properties('created_at', 'id').create()
schema.vertexLabel('DeleteEvent').properties('created_at', 'id').create()
schema.vertexLabel('Repository').properties('id', 'name', 'url').create()
schema.vertexLabel('IssuesEvent').properties('id', 'created_at').create()
schema.vertexLabel('PushEvent').properties('id', 'created_at').create()
schema.vertexLabel('IssueCommentEvent').properties('id', 'created_at').create()
schema.vertexLabel('PullRequestReviewCommentEvent').properties('id', 'created_at').create()
schema.vertexLabel('WatchEvent').properties('created_at', 'id').create()
schema.vertexLabel('MemberEvent').properties('id', 'created_at').create()
schema.edgeLabel('Createed').properties('action').connection('User', 'CreateEvent').create()
schema.edgeLabel('PullRequested').properties('action').connection('User', 'PullRequestEvent').create()
schema.edgeLabel('Forked').properties('action').connection('User', 'ForkEvent').create()
schema.edgeLabel('CommitCommented').properties('action').connection('User', 'CommitCommentEvent').create()
schema.edgeLabel('Releaseed').properties('action').connection('User', 'ReleaseEvent').create()
schema.edgeLabel('was_performed_on').properties('payload', 'public').connection('CreateEvent', 'Repository').connection('ReleaseEvent', 'Repository').connection('PullRequestEvent', 'Repository').connection('DeleteEvent', 'Repository').connection('IssuesEvent', 'Repository').connection('PushEvent', 'Repository').connection('CommitCommentEvent', 'Repository').connection('WatchEvent', 'Repository').connection('IssueCommentEvent', 'Repository').connection('ForkEvent', 'Repository').connection('MemberEvent', 'Repository').connection('PullRequestReviewCommentEvent', 'Repository').create()
schema.edgeLabel('Pushed').properties('action').connection('User', 'PushEvent').create()
schema.edgeLabel('IssueCommented').properties('action').connection('User', 'IssueCommentEvent').create()
schema.edgeLabel('Issuesed').properties('action').connection('User', 'IssuesEvent').create()
schema.edgeLabel('Watched').properties('action').connection('User', 'WatchEvent').create()
schema.edgeLabel('Deleteed').properties('action').connection('User', 'DeleteEvent').create()
schema.edgeLabel('Membered').properties('action').connection('User', 'MemberEvent').create()
schema.edgeLabel('PullRequestReviewCommented').properties('action').connection('User', 'PullRequestReviewCommentEvent').create()
schema.vertexLabel('CommitCommentEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('CreateEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('PushEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('PullRequestReviewCommentEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('ReleaseEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('ForkEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('MemberEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('PullRequestEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('Repository').index('byid').materialized().by('id').add()
schema.vertexLabel('IssuesEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('WatchEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('User').index('byid').materialized().by('id').add()
schema.vertexLabel('DeleteEvent').index('byid').materialized().by('id').add()
schema.vertexLabel('IssueCommentEvent').index('byid').materialized().by('id').add()